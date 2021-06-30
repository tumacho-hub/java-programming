package day_57_abstraction_polymorphism.abtractClass_vs_interface;

import java.io.Serializable;
/*
Interface CAN EXTEND Multiple Other Interfaces. Interfaces support
Multi-Inheritance
When it extents another interface, child interface is not responsible to override any methods.
Concrete sub class will be responsible for overriding all abstract methods.
 */
public interface InterfaceB extends InterfaceA, Serializable,Cloneable {

}
