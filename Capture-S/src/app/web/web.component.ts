import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-web',
  templateUrl: './web.component.html',
  styleUrls: ['./web.component.css']
})
export class WebComponent implements OnInit {
 liste = '';
  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get('http://localhost:8080/museums').subscribe(r => this.showReturn(r));
  }
  showReturn(r) {
    /*on change objet à string*/
    this.liste = JSON.stringify(r);
  }

}
