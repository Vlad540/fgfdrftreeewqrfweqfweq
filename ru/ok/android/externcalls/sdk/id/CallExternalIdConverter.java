package ru.ok.android.externcalls.sdk.id;

public class CallExternalIdConverter {
    private CallExternalIdConverter() {
    }

    public static ParticipantId convert(y41 y41) {
        if (y41 == null) {
            return null;
        }
        return new ParticipantId(y41.a, y41.b == 3, y41.c);
    }
}
