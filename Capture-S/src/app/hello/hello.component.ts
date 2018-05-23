import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent implements OnInit {
  etudiant = { 'nom': 'racic', 'age': 25, 'saved': false };
  etudiants = [{ 'nom': 'racic' }, { 'nom': 'andriani' }, { 'nom': 'Racic' }, { 'nom': 'Andriani' }];
  constructor() { }

  ngOnInit() {
  }

  getEtudiant(): void {
    this.etudiant.nom = 'defaut';
  }

  saveEtudiant() {
    this.etudiant.saved = true;
  }

}
