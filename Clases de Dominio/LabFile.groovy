package appet.loca

class LabFile
{
	int code
	Date date
	String name

	//Esta clase se relaciona con Laboratorio de alguna manera

    static constraints =
    {
    	code (unique:true, blank:false, min:1)
    	date (blank:false)
    	name (blank:false, minSize:5)
    }
}