package com.nexenio.bleindoorpositioning.ble.beacon;

import com.nexenio.bleindoorpositioning.ble.advertising.FakeEddystoneAdvertisingPacket;
import com.nexenio.bleindoorpositioning.location.provider.BeaconLocationProvider;
import com.nexenio.bleindoorpositioning.location.provider.FakeEddystoneLocationProvider;

public class FakeEddystone<P extends FakeEddystoneAdvertisingPacket> extends Beacon<P> {
    public static final int CALIBRATION_DISTANCE_DEFAULT = 0;

    public FakeEddystone() {
        this.calibratedDistance = CALIBRATION_DISTANCE_DEFAULT;
    }

    @Override
    public BeaconLocationProvider<FakeEddystone<P>> createLocationProvider() {
        return new FakeEddystoneLocationProvider<FakeEddystone<P>>(this) {
            @Override
            protected void updateLocation() {
                // nope
            }

            @Override
            protected boolean canUpdateLocation() {
                return false;
            }
        };
    }
}
