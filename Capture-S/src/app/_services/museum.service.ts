import { Injectable, EventEmitter } from '@angular/core';
import { Museum } from '../_models';

@Injectable({
  providedIn: 'root'
})
export class MuseumService {
  museums = [new Museum('Louvre Museum', 'Paris', 'Rue de Rivoli', 'art', '9am-6pm', 15),
  new Museum('MAMVP', 'Paris', 'Avenue du Président Wilson', 'art', '10am-6pm', 7),
  new Museum('Muséum National d\'Histoire Naturelle', 'Paris', 'Rue Voltaire', 'natural history', '9am-5pm', 10),
  new Museum('Musée d\'Orsay', 'Paris', 'Rue de la Légion d\'Honneur', 'art', '9:30am-6pm', 12),
  new Museum('Musée de l\'Orangerie', 'Paris', ' Jardin Tuileries', 'art', '9am-6pm', 9)];
  /*emitter;*/
  constructor() {
    /*this.emitter = new EventEmitter<string>();
    setInterval(() => this.emitter.next(Math.random()), 1000);*/
  }

  getMuseums() {
    return this.museums;
  }

  /*getEvent() {
    return this.emitter;
  }*/
}
