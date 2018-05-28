import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PhotodetailuserComponent } from './photodetailuser.component';

describe('PhotodetailuserComponent', () => {
  let component: PhotodetailuserComponent;
  let fixture: ComponentFixture<PhotodetailuserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PhotodetailuserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PhotodetailuserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
