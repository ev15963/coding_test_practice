import { IsString } from 'class-validator';

export class UserDto {
    @IsString()
    readonly singer: string;
} 