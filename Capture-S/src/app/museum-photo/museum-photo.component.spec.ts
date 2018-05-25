import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MuseumPhotoComponent } from './museum-photo.component';

describe('MuseumPhotoComponent', () => {
  let component: MuseumPhotoComponent;
  let fixture: ComponentFixture<MuseumPhotoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MuseumPhotoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MuseumPhotoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
