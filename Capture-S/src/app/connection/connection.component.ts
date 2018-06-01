import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-connection',
  templateUrl: './connection.component.html',
  styleUrls: ['./connection.component.css']
})
export class ConnectionComponent implements OnInit {
  passworduser: string;
  emailaddress: string;
  constructor(private router: Router) { }

  ngOnInit() {
    /*localStorage.setItem("user","vita");*/
  }

  getAccount() {
    localStorage.setItem('user', this.emailaddress);
    localStorage.setItem('pass', this.passworduser);
    this.router.navigate(['/feed']);
  }
}
