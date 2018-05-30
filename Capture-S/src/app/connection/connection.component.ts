import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-connection',
  templateUrl: './connection.component.html',
  styleUrls: ['./connection.component.css']
})
export class ConnectionComponent implements OnInit {
  passworduser: string;
  emailaddress: string;
  constructor() { }

  ngOnInit() {
    /*localStorage.setItem("user","vita");*/
  }

  getAccount() {
    localStorage.setItem('user', this.emailaddress);
    localStorage.setItem('pass', this.passworduser);
  }
}
