import {Component, Input, OnChanges, OnInit, SimpleChange, SimpleChanges} from '@angular/core';

@Component({
  selector: 'app-log-visualizer',
  templateUrl: './log-visualizer.component.html',
  styleUrls: ['./log-visualizer.component.css']
})
export class LogVisualizerComponent implements OnInit, OnChanges {

  @Input() jsonFile: string;
  _jsonFile: [];

  //updateInfoElement = [];

  constructor() {
    // if (this.jsonFile) {
    //   console.log('I am in constructor');
    //   updateInfoElement = this.jsonFile.VIN_Info.Update_Info;
    // }
  }

  ngOnInit() {
    // if (this.jsonFile) {
    //   console.log('I am in ngOnInit');
    //   updateInfoElement = this.jsonFile.VIN_Info.Update_Info;
    // }
  }

  /**
   * We need this as we want to break the whole json file into smaller arrays so that we can display it.
   */
  ngOnChanges(changes: SimpleChanges) {
    const jsonFileChange: SimpleChange = changes.jsonFile;
    //console.log('prev value: ', jsonFileChange.previousValue);
    //console.log('json File: ', jsonFileChange.currentValue);
    const currentValue = jsonFileChange.currentValue;
    if (currentValue) {
      //this._jsonFile = currentValue['VIN_Info[0].Update_Info[0].Log_Info[0]'];
      let jsonCurrentValue = JSON.parse(currentValue);

      //this._jsonFile = jsonCurrentValue['VIN_Info[0].Update_Info[0].Log_Info[0]'];
      this._jsonFile = jsonCurrentValue.VIN_Info[0].Update_Info[0].Log_Info;
      //this._jsonFile = JSONPath('$._links.self', jsonCurrentValue);
      //this._jsonFile = jsonCurrentValue._links;
      console.log('json File: ', this._jsonFile);
    }
  }
}
