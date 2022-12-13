import { Controller, Get, Param } from '@nestjs/common';
import { AppService } from './app.service';
import { UserDto } from './dto/app.dto';

@Controller()
export class AppController {
  constructor(private readonly appService: AppService) {}

  @Get()
  getHello(): string {
    return this.appService.getHello();
  }

  @Get('/total')
  getTotal() {
    const result = this.appService.getTotal();
    return result;
  }

  @Get('/singer/:singer')
  getSinger(@Param('singer') userData : UserDto) {
    const result = this.appService.getSinger(userData);
    return result;
  }
}
