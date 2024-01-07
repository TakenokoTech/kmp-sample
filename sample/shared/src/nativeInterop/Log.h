#include <stdio.h>

static void Log_debug(const char *text) {
    printf("Debug: %s\n", text);
}

static void Log_info(const char *text) {
    printf("Info: %s\n", text);
}

static void Log_warn(const char *text) {
    printf("Warn: %s\n", text);
}

static void Log_error(const char *text) {
    printf("Error: %s\n", text);
}
