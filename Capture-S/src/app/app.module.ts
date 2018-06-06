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
import { PhotodetailuserComponent } from './photodetailuser/photodetailuser.component';
import { SearchComponent } from './search/search.component';
import { ConnectionComponent } from './connection/connection.component';
import { FeedComponent } from './feed/feed.component';
import { LocationComponent } from './location/location.component';
import { AuthGuardService } from './_auth/auth-guard.service';
import { WebComponent } from './web/web.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';

const appRoutes: Routes = [{ path: '', component: MuseumComponent }, { path: 'hello', component: HelloComponent },
{ path: 'museum/:id', component: MuseumPhotoComponent },
{ path: 'photo/:id', component: PhotodetailuserComponent },
{ path: 'search', component: SearchComponent },
{ path: 'connection', component: ConnectionComponent },
{ path: 'location', component: LocationComponent },
{ path: 'feed', component: FeedComponent, canActivate: [AuthGuardService] }]
  ;

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    HeaderComponent,
    FooterComponent,
    MuseumComponent,
    MuseumDetailComponent,
    MuseumPhotoComponent,
    PhotodetailuserComponent,
    SearchComponent,
    ConnectionComponent,
    FeedComponent,
    LocationComponent,
    WebComponent,
  ],
  imports: [RouterModule.forRoot(appRoutes),
    BrowserModule, FormsModule, HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
