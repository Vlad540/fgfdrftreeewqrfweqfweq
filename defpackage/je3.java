package defpackage;

/* renamed from: je3  reason: default package */
public final class je3 implements dke {
    public final long X;
    public int Y;
    public final float a;
    public final double b;
    public final int c;
    public final long o;

    public je3(float f, long j, long j2) {
        boolean z = false;
        oyb.d(j2 > 0);
        oyb.d(f > 0.0f);
        if (0 <= j && j < j2) {
            z = true;
        }
        oyb.d(z);
        this.o = j;
        this.X = j2;
        this.a = f;
        this.c = Math.round((((float) (j2 - j)) / 1000000.0f) * f);
        this.b = (double) (1000000.0f / f);
    }

    public final dke a() {
        return new je3(this.a, this.o, this.X);
    }

    public final boolean hasNext() {
        return this.Y < this.c;
    }

    public final long next() {
        oyb.k(hasNext());
        int i = this.Y;
        this.Y = i + 1;
        long round = Math.round(this.b * ((double) i)) + this.o;
        oyb.k(round >= 0);
        return round;
    }
}
