package appet.loca

class Services
{
	String name
	String description
	static belongsTo= Veterinary

    static constraints =
    {
    	name (unique:true, blank:false, minSize:3)
    	description (blank:false, size:5..1000)
    }
}