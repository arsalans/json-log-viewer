import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {LogVisualizerComponent} from './log-visualizer.component';

describe('LogVisualizerComponent', () => {
  let component: LogVisualizerComponent;
  let fixture: ComponentFixture<LogVisualizerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [LogVisualizerComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LogVisualizerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
