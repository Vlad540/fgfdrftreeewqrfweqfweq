package defpackage;

import java.util.Locale;

/* renamed from: l24  reason: default package */
public final class l24 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;

    public /* synthetic */ l24(int i2) {
        this.a = i2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                int i2 = this.b;
                int i3 = this.c;
                int i4 = this.d;
                int i5 = this.e;
                int i6 = this.f;
                int i7 = this.g;
                int i8 = this.h;
                int i9 = this.i;
                int i10 = this.j;
                int i11 = this.k;
                long j2 = this.l;
                int i12 = this.m;
                int i13 = mze.a;
                Locale locale = Locale.US;
                StringBuilder i14 = rf0.i("DecoderCounters {\n decoderInits=", i2, ",\n decoderReleases=", i3, "\n queuedInputBuffers=");
                th2.l(i14, i4, "\n skippedInputBuffers=", i5, "\n renderedOutputBuffers=");
                th2.l(i14, i6, "\n skippedOutputBuffers=", i7, "\n droppedBuffers=");
                th2.l(i14, i8, "\n droppedInputBuffers=", i9, "\n maxConsecutiveDroppedBuffers=");
                String str = "\n droppedToKeyframeEvents=";
                int i15 = i10;
                int i16 = i11;
                th2.l(i14, i15, str, i16, "\n totalVideoFrameProcessingOffsetUs=");
                i14.append(j2);
                i14.append("\n videoFrameProcessingOffsetCount=");
                i14.append(i12);
                i14.append("\n}");
                return i14.toString();
            default:
                int i17 = this.b;
                int i18 = this.c;
                int i19 = this.d;
                int i20 = this.e;
                int i21 = this.f;
                int i22 = this.g;
                int i23 = this.h;
                int i24 = this.i;
                int i25 = this.j;
                int i26 = this.k;
                long j3 = this.l;
                int i27 = this.m;
                int i28 = oze.a;
                Locale locale2 = Locale.US;
                StringBuilder i29 = rf0.i("DecoderCounters {\n decoderInits=", i17, ",\n decoderReleases=", i18, "\n queuedInputBuffers=");
                th2.l(i29, i19, "\n skippedInputBuffers=", i20, "\n renderedOutputBuffers=");
                th2.l(i29, i21, "\n skippedOutputBuffers=", i22, "\n droppedBuffers=");
                String str2 = "\n droppedInputBuffers=";
                th2.l(i29, i23, str2, i24, "\n maxConsecutiveDroppedBuffers=");
                int i30 = i25;
                th2.l(i29, i30, "\n droppedToKeyframeEvents=", i26, "\n totalVideoFrameProcessingOffsetUs=");
                i29.append(j3);
                i29.append("\n videoFrameProcessingOffsetCount=");
                i29.append(i27);
                i29.append("\n}");
                return i29.toString();
        }
    }
}
