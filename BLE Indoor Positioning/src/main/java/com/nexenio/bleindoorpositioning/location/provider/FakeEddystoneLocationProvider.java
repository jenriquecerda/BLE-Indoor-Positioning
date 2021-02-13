package com.nexenio.bleindoorpositioning.location.provider;

import com.nexenio.bleindoorpositioning.ble.beacon.FakeEddystone;

public abstract class FakeEddystoneLocationProvider<B extends FakeEddystone> extends BeaconLocationProvider<B> {

    public FakeEddystoneLocationProvider(B beacon) {
        super(beacon);
    }
}
