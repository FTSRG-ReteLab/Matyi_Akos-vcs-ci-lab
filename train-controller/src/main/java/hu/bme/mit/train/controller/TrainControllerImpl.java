package hu.bme.mit.train.controller;

import hu.bme.mit.train.interfaces.TrainController;

import java.sql.Time;
import java.util.Timer;

public class TrainControllerImpl implements TrainController {

	private int step = 20;
	private int referenceSpeed = 0;
	private int speedLimit = 50;

	private Thread thread;

	public TrainControllerImpl(){
		thread = new Thread(){
			public void run(){
				thread.start();
				try{
					followSpeed();
					sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}

	@Override
	public void followSpeed() {
		if (referenceSpeed < 0) {
			referenceSpeed = 0;
		} else {
		    if(referenceSpeed+step > 0) {
                referenceSpeed += step;
            } else {
		        referenceSpeed = 0;
            }
		}

		enforceSpeedLimit();
	}

	@Override
	public int getReferenceSpeed() {
		return referenceSpeed;
	}

	@Override
	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
		enforceSpeedLimit();
		
	}

	private void enforceSpeedLimit() {
		if (referenceSpeed > speedLimit) {
			referenceSpeed = speedLimit;
		}
	}

	@Override
	public void setJoystickPosition(int joystickPosition) {
		this.step = joystickPosition;		
	}

}
