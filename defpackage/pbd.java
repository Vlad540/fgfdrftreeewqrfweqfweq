package defpackage;

import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;

/* renamed from: pbd  reason: default package */
public final /* synthetic */ class pbd implements i34 {
    public final /* synthetic */ Integer X;
    public final /* synthetic */ Boolean Y;
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int o;

    public /* synthetic */ pbd(long j, long j2, String str, int i, Integer num, Boolean bool) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.o = i;
        this.X = num;
        this.Y = bool;
    }

    public final Object a() {
        return new ChatMediaDownloadBottomSheet(this.a, this.b, this.c, this.o, this.X, this.Y);
    }
}
