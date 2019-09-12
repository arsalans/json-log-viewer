import {Pipe, PipeTransform} from '@angular/core';

@Pipe({name: 'keys'})
export class KeysPipe implements PipeTransform {
  transform(values, args: string[]): any {
    const keys = [];
    for (const key in values) {
      keys.push(key);
    }
    return keys;
  }
}
