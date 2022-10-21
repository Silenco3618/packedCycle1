package ru.netology.sqr;
public class SQRService {

        public int calcSqrt(int i_min, int i_max) {
            int numeric = 0;

            for(int number = 10; number <= 99; number++){
                if (number * number >= i_min & number * number <= i_max) {
                    numeric++;
                }
            }
            return numeric;
        }
}
