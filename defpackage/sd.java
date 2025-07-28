package defpackage;

import android.graphics.Matrix;
import android.media.Image;

/* renamed from: sd  reason: default package */
public final class sd implements lr6 {
    public final Image a;
    public final mv4[] b;
    public final q90 c;

    public sd(Image image) {
        this.a = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.b = new mv4[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.b[i] = new mv4(2, planes[i]);
            }
        } else {
            this.b = new mv4[0];
        }
        this.c = new q90(s9e.b, image.getTimestamp(), 0, new Matrix());
    }

    public final Image Z() {
        return this.a;
    }

    public final void close() {
        this.a.close();
    }

    public final int getHeight() {
        return this.a.getHeight();
    }

    public final pq6 getImageInfo() {
        return this.c;
    }

    public final int getWidth() {
        return this.a.getWidth();
    }

    public final int k0() {
        return this.a.getFormat();
    }

    public final mv4[] v() {
        return this.b;
    }
}
