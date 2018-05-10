package dl.marsrover.command.axis;

public class Coordinates2D implements Coordinates {
	
	private Integer xAxis;
	private Integer yAxis;
	
	
	public Coordinates2D(Integer xAxis, Integer yAxis) {
		super();
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}


	public Integer getxAxis() {
		return xAxis;
	}
	
	public Integer getyAxis() {
		return yAxis;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((xAxis == null) ? 0 : xAxis.hashCode());
		result = prime * result + ((yAxis == null) ? 0 : yAxis.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordinates2D other = (Coordinates2D) obj;
		if (xAxis == null) {
			if (other.xAxis != null)
				return false;
		} else if (!xAxis.equals(other.xAxis))
			return false;
		if (yAxis == null) {
			if (other.yAxis != null)
				return false;
		} else if (!yAxis.equals(other.yAxis))
			return false;
		return true;
	}

}
