package com.example.demo.solid.dependency_inversion;
/*
Varlıklar(Alt sınıflar ve Üst sınıflar) somut olmayan soyutlamalara bağlı olmalıdır. Üst seviye modülün düşük seviye
modülüne bağlı olmamasını, ancak soyutlamalara bağlı olması gerektiğini belirtir. Alt sınıflarda yapılan
 değişiklikler üst sınıfları etkilememelidir.
 */
public interface IControll {
    void apply();
}
