package com.nexenio.bleindoorpositioning.ble.advertising;

public class FakeEddystoneAdvertisingPacketFactory extends EddystoneAdvertisingPacketFactory {
    @Override
    public AdvertisingPacketFactory getAdvertisingPacketFactory(byte[] advertisingData) {
        return super.getAdvertisingPacketFactory(advertisingData);
    }

    @Override
    public boolean canCreateAdvertisingPacket(byte[] advertisingData) {
        return FakeEddystoneAdvertisingPacket.meetsSpecification(advertisingData);
    }
}
