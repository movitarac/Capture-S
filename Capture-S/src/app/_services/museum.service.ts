import { Injectable, EventEmitter } from '@angular/core';
import { Museum } from '../_models';

@Injectable({
  providedIn: 'root'
})
export class MuseumService {
  edit = false;
  museum;
  museums = [new Museum('Musée du Louvre ', 'Paris', 'Rue de Rivoli', 'art', '9am-6pm', 15, 'louvre.jpg'),
  new Museum('Musée d\'Art Moderne de la Ville de Paris', 'Paris', 'Avenue du Président Wilson', 'art', '10am-6pm', 7, 'mamvp.jpg'),
  new Museum('Muséum National d\'Histoire Naturelle', 'Paris', 'Rue Voltaire', 'natural history', '9am-5pm', 10, 'histoireNat.jpg'),
  new Museum('Musée d\'Orsay', 'Paris', 'Rue de la Légion d\'Honneur', 'art', '9:30am-6pm', 12, 'orsay.jpg'),
  new Museum('Musée de l\'Orangerie', 'Paris', ' Jardin Tuileries', 'art', '9am-6pm', 9, 'orange.jpg'),
  new Museum('Fondation Louis Vuitton', 'Paris', ' Avenue du Mahatma Gandhi', 'art', '10am-8pm', 5, 'flv.jpg')];
  /*emitter;*/
  constructor() {
    /*this.emitter = new EventEmitter<string>();
    setInterval(() => this.emitter.next(Math.random()), 1000);*/
  }

  getMuseums() {
    return this.museums;
  }

  getMuseumById(id: number): Museum {
    console.log(id);
    /*for (let i = 0; i < this.museums.length; i++) {
      if (this.museums[i].id === id) {
        return this.museums[i];
      }
    }
    return null;*/
    /*0 correspond au 1er element m => lamda*/
    /* filter attend une fonction apres chevron c'est la condition, avant chevron c'est le param*/
    return this.museums.filter(m => m.id === id)[0];
  }
  editMuseum(id: number) {
    /*console.log(id);*/
    this.museum = this.getMuseumById(id);
    this.edit = true;
  }
  /*getEvent() {
    return this.emitter;
  }*/
}
