import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
 /*wordsToSearch: string;
  list = ['Luca', 'Test', 'Element'];
  resultList = [];
*/
  constructor() { }

  ngOnInit() {
  }
/*
  search() {
    this.resultList =  this.list.filter(
      e => e.toUpperCase().indexOf(this.wordsToSearch.toUpperCase()) !== -1
    );
  }

*/

}
