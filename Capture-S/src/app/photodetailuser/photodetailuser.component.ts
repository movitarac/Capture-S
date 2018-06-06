import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { MuseumService } from '../_services/museum.service';
import { PhotoService } from '../_services/photo.service';

@Component({
  selector: 'app-photodetailuser',
  templateUrl: './photodetailuser.component.html',
  styleUrls: ['./photodetailuser.component.css']
})
export class PhotodetailuserComponent implements OnInit {
  param: number;
  photo;
  constructor(private activatedRoute: ActivatedRoute,
    private photoService: PhotoService) { }

  ngOnInit() {
    this.activatedRoute.params.subscribe(p => this.loadPhoto(p['id']));

    // this.museum = this.museumService.getMuseumById(this.param);
  }

  loadPhoto(id: string) {
    /*this.param = +id; /*convertir string en number avec + */
  this.photo = this.photoService.getPhotoById(+id);

  }


}
