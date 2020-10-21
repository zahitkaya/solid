package com.example.demo.solid.open_closed;

interface CalculationOperator {
    //Bu prensing Single Responsibilityle bağımlıdır.
    //Open kısmını değiştirilebilir olarak düşünebiliriz.
    //Eğer projemize ilerde yeni bir şey eklememiz gerektiğinde open kısmı değiştirmeliyiz.
    //Close kısmı ise asla değişmemelidir.
    int calculate();
}
