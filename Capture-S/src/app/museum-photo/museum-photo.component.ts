import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MuseumService } from '../_services/museum.service';

@Component({
  selector: 'app-museum-photo',
  templateUrl: './museum-photo.component.html',
  styleUrls: ['./museum-photo.component.css']
})
export class MuseumPhotoComponent implements OnInit {
  /*photo = new Photo('Lots of collections', 'long queue', 'Nikon', 10);*/
  param: number;
  museum;
  constructor(private activatedRoute: ActivatedRoute,
    private museumService: MuseumService) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe(p => this.loadMuseum(p['id']));
    // this.museum = this.museumService.getMuseumById(this.param);
  }

  loadMuseum(id: string) {
    /*this.param = +id; /*convertir string en number avec + */
  this.museum = this.museumService.getMuseumById(+id);
  }

}
