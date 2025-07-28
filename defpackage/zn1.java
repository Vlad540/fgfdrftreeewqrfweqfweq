package defpackage;

import ru.ok.android.externcalls.sdk.video.CameraManager;

/* renamed from: zn1  reason: default package */
public final /* synthetic */ class zn1 extends gc9 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn1(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.a = i2;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                CameraManager a2 = ((d11) this.receiver).a();
                boolean z = false;
                if (a2 != null && a2.isCameraEnabled()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                return ((ac9) this.receiver).a;
            case 2:
                return ((ac9) this.receiver).c;
            case 3:
                return ((ac9) this.receiver).b;
            case 4:
                return ((ac9) this.receiver).a;
            case 5:
                return ((ac9) this.receiver).b;
            case 6:
                return ((ac9) this.receiver).c;
            case 7:
                return ((ac9) this.receiver).d;
            case 8:
                return ((ac9) this.receiver).a;
            case 9:
                return ((ac9) this.receiver).b;
            case 10:
                return ((ac9) this.receiver).c;
            case 11:
                return ((ac9) this.receiver).d;
            default:
                return ((ac9) this.receiver).d;
        }
    }

    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CameraManager a2 = ((d11) this.receiver).a();
                if (a2 != null) {
                    a2.setCameraEnabled(booleanValue);
                    return;
                }
                return;
            case 1:
                ((ac9) this.receiver).a = (k88) obj;
                return;
            case 2:
                ((ac9) this.receiver).c = (k88) obj;
                return;
            case 3:
                ((ac9) this.receiver).b = (k88) obj;
                return;
            case 4:
                ((ac9) this.receiver).a = (k88) obj;
                return;
            case 5:
                ((ac9) this.receiver).b = (k88) obj;
                return;
            case 6:
                ((ac9) this.receiver).c = (k88) obj;
                return;
            case 7:
                ((ac9) this.receiver).d = (k88) obj;
                return;
            case 8:
                ((ac9) this.receiver).a = (k88) obj;
                return;
            case 9:
                ((ac9) this.receiver).b = (k88) obj;
                return;
            case 10:
                ((ac9) this.receiver).c = (k88) obj;
                return;
            case 11:
                ((ac9) this.receiver).d = (k88) obj;
                return;
            default:
                ((ac9) this.receiver).d = (k88) obj;
                return;
        }
    }
}
