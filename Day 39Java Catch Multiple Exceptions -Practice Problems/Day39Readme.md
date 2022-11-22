//Java Nested try block
In Java, using a try block inside another try block is permitted. It is called as nested try block. Every statement that we enter a statement in try block, context of that exception is pushed onto the stack.

For example, the inner try block can be used to handle ArrayIndexOutOfBoundsException while the outer try block can handle the ArithemeticException (division by zero).

Why use nested try block
Sometimes a situation may arise where a part of a block may cause one error and the entire block itself may cause another error. In such cases, exception handlers have to be nested. 
Nested Try Block
// Try Block 1

try {
    // Try Block 2
    try {
        // Try Block 3
        try {
            // Try Block 4
            try {
                // Try Block 5
                try {
                    // Try Block 6
                    try {
                        // Try Block 7
                        try {
                            // Try Block 8
                            try {
                                // Try Block 9
                                try {
                                    // Try Block 10
                                    try {
                                        // Try Block 11
                                        try {
                                            // Try Block 12
                                            try {
                                                // Try Block 13
                                                try {
                                                    // Try Block 14
                                                    try {
                                                        // Try Block 15
                                                        try {
                                                            // Try Block 16
                                                            try {
                                                                // Try Block 17
                                                                try {
                                                                    // Try Block 18
                                                                    try {
                                                                        // Try Block 19
                                                                        try {
                                                                            // Try Block 20
                                                                            try {
                                                                                // Try Block 21
                                                                                try {
                                                                                    // Try Block 22
                                                                                    try {
                                                                                        // Try Block 23
                                                                                        try {
                                                                                            // Try Block 24
                                                                                            try {
                                                                                                // Try Block 25
                                                                                                try {
                                                                                                    // Try Block 26
                                                                                                    try {
                                                                                                        // Try Block 27
                                                                                                        try {
                                                                                                            // Try Block 28
                                                                                                            try {
                                                                                                                // Try Block 29
                                                                                                                try {
                                                                                                                    // Try Block 30
                                                                                                                    try {
                                                                                                                        // Try Block 31
                                                                                                                        try {
                                                                                                                            // Try Block 32
                                                                                                                            try {
                                                                                                                                // Try Block 33
                                                                                                                                try {
                                                                                                                                    // Try Block 34
                                                                                                                                    try {
                                                                                                                                        // Try Block 35
                                                                                                                                        try {
                                                                                                                                            // Try Block 36
                                                                                                                                            try {
                                                                                                                                                // Try Block 37
                                                                                                                                                try {
                                                                                                                                                    // Try Block 38
                                                                                                                                                    try {
                                                                                                                                                        // Try Block 39
                                                                                                                                                        try {
                                                                                                                                                            // Try Block 40
                                                                                                                                                            try {
                                                                                                                                                                // Try Block 41
                                                                                                                                                                try {
                                                                                                                                                                    // Try Block 42
                                                                                                                                                                    try {
                                                                                                                                                                        // Try Block 43
                                                                                                                                                                        try {
                                                                                                                                                                            // Try Block 44
                                                                                                                                                                            try {
                                                                                                                                                                                // Try Block 45
                                                                                                                                                                                try {
                                                                                                                                                                                    // Try Block 46
                                                                                                                                                                                    try {
                                                                                                                                                                                        // Try Block

