# Assignment 
We have to create HRMS 
should provide this functionality 

hire(IEmployee emp) {
}
terminate(IEmployee emp){
}
bonus(IEmployee emp) {
}
displayDetails(IEmployee emp) {

}
// FT // Contractor // Interns 
they can only be considered as employee managed by 
HRMS when thy implement inteface IEmployee

IEmployee {
    hire() // hiring require 3 interviews (Emp) // Contractors 2 // intern 1 interview
    terminate() // employee will get 2 weeks serverance// Contrators nothing/ interen nothing
    bonus // emp get 2 weeks // contract nothing// intens 1 week
    display - name, type, bonus, salary
}

