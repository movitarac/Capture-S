import { Component, OnInit } from '@angular/core';
import { Museum } from '../_models';
import { MuseumService } from '../_services/museum.service';
import { HttpClient } from '@angular/common/http';



@Component({
  selector: 'app-museum',
  templateUrl: './museum.component.html',
  styleUrls: ['./museum.component.css']
})
export class MuseumComponent implements OnInit {
  /*json
  museums = [{ 'name': 'Louvre Museum', 'city': 'Paris' }, { 'name': 'MAMVP', 'city': 'Paris' },
  { 'name': 'Muséum National d\'Histoire Naturelle', 'city': 'Paris' },
  { 'name': ' Musée d\'Orsay', 'city': 'Paris' }, { 'name': ' Musée de l\'Orangerie', 'city': 'Paris' }];
  */
  museum = { 'name': '', 'city': '' };
  edit = false;

  museums = [];
  liste = '';
  selectedMuseum: Museum;
  selectM = false;
  /*private va rajouter dans la classe a un attribut qui peut etre atteint de partout..
  typescript va rajouter automatiquement comme un attribut en haut (museums, etc)*/
  constructor(private museumService: MuseumService) {

  }
  /* ngOnInit() is a lifecycle hooks(sequence)*/
  ngOnInit() {
    /*this.museums = this.museumService.getMuseums();*/
    this.museumService.getMuseums().subscribe(r => this.loadData(r));
    /*this.museumService.getEvent().subscribe(a => console.log(a));*/
  }
  loadData(r: Museum[]) {
    this.museums = r;
  }
  onSelect(m: Museum): void {
    if (this.selectM === false) {
      this.selectedMuseum = m;
      this.selectM = true;
    } else {
      this.selectedMuseum = null;
      this.selectM = false;
    }
  }
  addMuseum() {
    this.museums.push(this.museum);
    this.museum = new Museum();
  }

  editMuseum(id: number) {
    /*console.log(id);*/
    this.museum = this.getMuseumById(id);
    this.edit = true;
  }

  getMuseumById(id: number): Museum {
    /*for (let i = 0; i < this.museums.length; i++) {
      if (this.museums[i].id === id) {
        return this.museums[i];
      }
    }
    return null;*/
    /*0 correspond au 1er element m => lamda*/
    /* filter attend une fonction, apres chevron c'est la condition, avant chevron c'est le param*/
    return this.museums.filter(m => m.id === id)[0];

  }

  editOver() {
    this.edit = false;
    this.museum = new Museum();
  }
}
