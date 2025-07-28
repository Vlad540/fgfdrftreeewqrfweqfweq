package defpackage;

/* renamed from: aof  reason: default package */
public enum aof implements kkf {
    SECURE_SAVE_KEY("WebAppSecureStorageSaveKey", "secure_storage_save_key", 1),
    SECURE_GET_KEY("WebAppSecureStorageGetKey", "secure_storage_get_key", 2),
    SECURE_CLEAR_KEYS("WebAppSecureStorageClear", "secure_storage_clear", 4),
    SAVE_KEY("WebAppDeviceStorageSaveKey", "device_storage_save_key", 5),
    GET_KEY("WebAppDeviceStorageGetKey", "device_storage_get_key", 6),
    CLEAR_KEYS("WebAppDeviceStorageClear", "device_storage_clear", 7);
    
    public final String a;
    public final String b;
    public final Integer c;

    static {
        aof[] aofArr;
        z0 = new pz4(aofArr);
    }

    /* access modifiers changed from: public */
    aof(String str, String str2, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = num;
    }

    public final Integer a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }
}
