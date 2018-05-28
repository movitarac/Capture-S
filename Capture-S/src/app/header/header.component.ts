import { Component, OnInit } from '@angular/core';
import { Museum } from '../_models';
import { MuseumService } from '../_services/museum.service';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  wordsToSearch: string;
  museum = new Museum();
  museums;
  resultList = [];
  constructor(private museumService: MuseumService) { }

  ngOnInit() {
    this.museums = this.museumService.getMuseums();
  }
  searchMuseum() {
    if (this.wordsToSearch == null) {
      this.resultList = null;
    } else {
      this.resultList = this.museums.filter(
        e => e.name.toUpperCase().indexOf(this.wordsToSearch.toUpperCase()) !== -1
      );
    }
  }
}
