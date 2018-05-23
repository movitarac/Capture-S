import { Component, OnInit } from '@angular/core';
import { Museum } from '../_models';

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
  /*museum = { 'name': '', 'city': '' };*/
  edit = false;
  museums = [new Museum('Louvre Museum', 'Paris'), new Museum('MAMVP', 'Paris'),
  new Museum('Muséum National d\'Histoire Naturelle', 'Paris'), new Museum('Musée d\'Orsay', 'Paris'),
  new Museum('Musée de l\'Orangerie', 'Paris')];
  museum = new Museum();
  constructor() { }

  ngOnInit() {
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
    /* filter attend une fonction 
    apres chevron c'est la condition, avant chevron c'est le param*/
    return this.museums.filter(m => m.id === id)[0];
  }

  editOver() {
    this.edit = false;
    this.museum = new Museum();
  }
}
