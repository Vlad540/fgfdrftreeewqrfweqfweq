package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bhc  reason: default package */
public final class bhc {
    public final /* synthetic */ int a;
    public final ahc b;
    public fhc c;
    public rg4 d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;

    public bhc(ahc ahc) {
        this.a = 0;
        this.c = null;
        this.d = null;
        this.e = TimeUnit.MILLISECONDS.toMillis(200);
        this.f = TimeUnit.SECONDS.toMillis(4);
        this.g = 2.0f;
        this.h = 0.1f;
        this.b = ahc;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "RtcCommandConfig{command=" + this.b + ", sentListener=null, successListener=" + this.c + ", errorListener=" + this.d + ", maxRetryCount=0, minRetryTimeoutMs=" + this.e + ", maxRetryTimeoutMs=" + this.f + ", retryBackoffFactor=" + this.g + ", retryBackoffJitter=" + this.h + '}';
            default:
                return super.toString();
        }
    }

    public bhc(bhc bhc) {
        this.a = 1;
        ahc ahc = bhc.b;
        if (ahc != null) {
            long j = bhc.e;
            if (j >= 0) {
                long j2 = bhc.f;
                if (j2 >= 0) {
                    float f2 = bhc.g;
                    if (f2 >= 0.0f) {
                        float f3 = bhc.h;
                        if (f3 >= 0.0f) {
                            this.b = ahc;
                            this.c = bhc.c;
                            this.d = bhc.d;
                            this.e = j;
                            this.f = j2;
                            this.g = f2;
                            this.h = f3;
                            return;
                        }
                        throw new IllegalArgumentException("Illegal 'retryBackoffJitter' value: " + f3);
                    }
                    throw new IllegalArgumentException("Illegal 'retryBackoffFactor' value: " + f2);
                }
                throw new IllegalArgumentException(us8.i(j2, "Illegal 'maxRetryTimeoutMs' value: "));
            }
            throw new IllegalArgumentException(us8.i(j, "Illegal 'minRetryTimeoutMs' value: "));
        }
        throw new IllegalArgumentException("Illegal 'command' value: null");
    }
}
