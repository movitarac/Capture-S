import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';

import { MuseumComponent } from './museum/museum.component';
import { MuseumDetailComponent } from './museum-detail/museum-detail.component';
import { MuseumService } from './_services/museum.service';
import { RouterModule, Routes } from '@angular/router';
import { MuseumPhotoComponent } from './museum-photo/museum-photo.component';


const appRoutes: Routes = [{ path: '', component: MuseumComponent }, { path: 'hello', component: HelloComponent },
{ path: 'photo/:id', component: MuseumPhotoComponent }];

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    HeaderComponent,
    FooterComponent,
    MuseumComponent,
    MuseumDetailComponent,
    MuseumPhotoComponent,
  ],
  imports: [RouterModule.forRoot(appRoutes),
    BrowserModule, FormsModule
  ],
  providers: [MuseumService],
  bootstrap: [AppComponent]
})
export class AppModule { }
