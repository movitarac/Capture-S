import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MuseumService } from '../_services/museum.service';
import { PhotoService } from '../_services/photo.service';
import { Photo } from '../_models/photo';
import { Museum } from '../_models';

@Component({
  selector: 'app-museum-photo',
  templateUrl: './museum-photo.component.html',
  styleUrls: ['./museum-photo.component.css']
})
export class MuseumPhotoComponent implements OnInit {
  /*photo = new Photo('Lots of collections', 'long queue', 'Nikon', 10);*/
  param: number;
  museums;
  museum;
  photos = [];
  constructor(private activatedRoute: ActivatedRoute,
    private museumService: MuseumService, private photoService: PhotoService) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe(p => this.loadPhoto(p['id']));
    /*this.photoService.getPhotos().subscribe(r => this.loadPhotos(r));*/
    // this.museum = this.museumService.getMuseumById(this.param);
  }
  /*
  loadPhotos(r: Photo[]) {
    this.photos = r;
  }
  loadMuseums(m: Museum []) {
    this.museums = m;
  }
  */
  loadPhoto(id: string) {
    /*this.param = +id; /*convertir string en number avec + */
    this.museum = this.museumService.getMuseumById(+id);
    this.museumService.getMuseumById(+id).subscribe(m => this.photos = m);
  }

}
