/** ACK / NACK / ERROR values as a result of MAV_CMDs and for mission item transmission.
*/
package com.jeremydyer.mavlink.Messages.enums;

public class MAV_CMD_ACK {
	public static final int MAV_CMD_ACK_OK = 1; /* Command / mission item is ok. | */
	public static final int MAV_CMD_ACK_ERR_FAIL = 2; /* Generic error message if none of the other reasons fails or if no detailed error reporting is implemented. | */
	public static final int MAV_CMD_ACK_ERR_ACCESS_DENIED = 3; /* The system is refusing to accept this command from this source / communication partner. | */
	public static final int MAV_CMD_ACK_ERR_NOT_SUPPORTED = 4; /* Command or mission item is not supported, other commands would be accepted. | */
	public static final int MAV_CMD_ACK_ERR_COORDINATE_FRAME_NOT_SUPPORTED = 5; /* The coordinate frame of this command / mission item is not supported. | */
	public static final int MAV_CMD_ACK_ERR_COORDINATES_OUT_OF_RANGE = 6; /* The coordinate frame of this command is ok, but he coordinate values exceed the safety limits of this system. This is a generic error, please use the more specific error messages below if possible. | */
	public static final int MAV_CMD_ACK_ERR_X_LAT_OUT_OF_RANGE = 7; /* The X or latitude value is out of range. | */
	public static final int MAV_CMD_ACK_ERR_Y_LON_OUT_OF_RANGE = 8; /* The Y or longitude value is out of range. | */
	public static final int MAV_CMD_ACK_ERR_Z_ALT_OUT_OF_RANGE = 9; /* The Z or altitude value is out of range. | */
	public static final int MAV_CMD_ACK_ENUM_END = 10; /*  | */
}
