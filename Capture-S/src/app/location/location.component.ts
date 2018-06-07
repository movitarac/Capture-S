import { Component, OnInit } from '@angular/core';
import * as L from 'leaflet';
import { ActivatedRoute, RouterLink, Router } from '@angular/router';
import { Museum } from '../_models';
import { MuseumService } from '../_services/museum.service';
@Component({
  selector: 'app-location',
  templateUrl: './location.component.html',
  styleUrls: ['./location.component.css']
})
export class LocationComponent implements OnInit {
  map;
  museum;
  museums = [];
  markers = [];
  marker;
  show = false;
  buttonShowHide = { 'name': 'Show' };
  baseIcon = L.icon({
    iconUrl: 'assets/museum2.png'
  });
  constructor(private museumService: MuseumService, private router: Router) { }
  ngOnInit() {
    this.museumService.getMuseums().subscribe(r => this.loadData(r));

    /*this.museums = this.museumService.getMuseums();*/
    this.map = L.map('map').setView([48.8566, 2.3522], 12);
    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    }).addTo(this.map);
    /*this.marker = [this.addMarker(48.8584, 2.2945, 'Eiffel Tower')];*/
  }
  loadData(r: Museum[]) {
    this.museums = r;
  }
  addMarker(lat, lng, popup, id) {
    return L.marker([lat, lng], { icon: this.baseIcon }).bindPopup(popup).addTo(this.map).on('click', () =>
    this.eventOnClick(popup, id));
  }
  eventOnClick(popup, id) {
    alert(popup);
    this.linkToMuseum(id);
  }
  onCLickAddressMuseum() {
    if (this.show === false) {
      for (let i = 0; i < this.museums.length; i++) {
        this.markers.push(this.addMarker(this.museums[i].lat, this.museums[i].longi, this.museums[i].name, this.museums[i].id));
        /*console.log(this.markers);*/
      }
      this.show = true;
      this.buttonShowHide = { 'name': 'Hide' };
    } else {
      for (let i = 0; i < this.markers.length; i++) {
        this.markers[i].remove();
        this.buttonShowHide = { 'name': 'Show' };
        this.show = false;
      }
    }
  }
  linkToMuseum(id) {
    for (let i = 0; i < this.museums.length; i++) {
      if (this.museums[i].id === id) {
        this.router.navigate(['/museum', this.museums[i].id]);
      }
    }

  }
}
