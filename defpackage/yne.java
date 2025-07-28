package defpackage;

/* renamed from: yne  reason: default package */
public final class yne extends b97 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zne b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yne(zne zne, int i) {
        super(0);
        this.a = i;
        this.b = zne;
    }

    public final Object invoke() {
        String str;
        switch (this.a) {
            case 0:
                zne zne = this.b;
                String str2 = zne.a;
                boe a2 = zne.a();
                if (a2 == null || (str = a2.versionName()) == null) {
                    str = "NA";
                }
                boe a3 = zne.a();
                String str3 = null;
                String buildUuid = a3 != null ? a3.buildUuid() : null;
                boe a4 = zne.a();
                if (a4 != null) {
                    str3 = a4.environment();
                }
                return new vne(str2, str, buildUuid, str3);
            default:
                zne zne2 = this.b;
                try {
                    return at7.G(zne2.a);
                } catch (Exception unused) {
                    String str4 = zne2.a;
                    return null;
                }
        }
    }
}
