cmake_minimum_required(VERSION 3.4.1)
file(GLOB_RECURSE sources "../nativeInterop/cinterop/*.c")
add_library(shared SHARED ${sources})
target_link_libraries(shared)
