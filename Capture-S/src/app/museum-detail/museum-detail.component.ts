import { Component, OnInit, Input } from '@angular/core';
import { Museum } from '../_models';
@Component({
  selector: 'app-museum-detail',
  templateUrl: './museum-detail.component.html',
  styleUrls: ['./museum-detail.component.css']
})
export class MuseumDetailComponent implements OnInit {
  /*museum = new Museum('MAMVP', 'Paris', 'Avenue du Président Wilson', 'art', '10am-6pm', 7);*/

 @Input() museum: Museum;
  constructor() { }

  ngOnInit() {
  }

}
