import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OperadorTableComponent } from './operador-table.component';

describe('OperadorTableComponent', () => {
  let component: OperadorTableComponent;
  let fixture: ComponentFixture<OperadorTableComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [OperadorTableComponent]
    });
    fixture = TestBed.createComponent(OperadorTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
