import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService implements CanActivate {
  canActivate() {
    console.log(localStorage.getItem('user'));
    if (localStorage.getItem('user') === null) {
      console.log(localStorage.getItem('user'));
      this.router.navigate(['/connection']);
    }
    return true;
  }
  constructor(private router: Router) { }
}
