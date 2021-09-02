class Rectangle{
    constructor(width,height){
        this.width=width;
        this.height=height;
    }
    getArea(){
        console.log('The Area is: '+this.width*this.height);
    }
    }
    var r1 = new Rectangle(4,5)
    r1.hieght=50;
    r1.getArea();