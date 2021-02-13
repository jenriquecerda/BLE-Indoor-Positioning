package com.nexenio.bleindoorpositioning.ble.advertising;

import java.util.Arrays;

public class FakeEddystoneAdvertisingPacket extends EddystoneAdvertisingPacket {
    private static final byte[] EXPECTED_FLAGS = {0x05, 0x08, 0x62};
    private static final byte[] EXPECTED_FAKE_EDDYSTONE_UUID = {0x65, 0x61, 0x63, 0x00};

    public FakeEddystoneAdvertisingPacket(byte[] data) {
        super(data);
    }

    public static boolean meetsSpecification(byte[] data) {
        if (data == null || data.length < 15) {
            return false;
        }

        if (!Arrays.equals(getFlags(data), EXPECTED_FLAGS)) {
            return false;
        }

        return Arrays.equals(getEddystoneUuid(data), EXPECTED_FAKE_EDDYSTONE_UUID);
    }
}
