# magicdraw-with-docker
Run MagicDraw 16.9 in a Docker container.

See [MagicDraw in Docker](https://wiki.bitplan.com/index.php/MagicDraw_in_Docker).

The goal is to get an older MagicDraw 16.9 working in a container.
The [MagicDraw website https://www.magicdraw.com](https://www.magicdraw.com) has not been updated since 2017.
No Magic Inc has been acquired by [Dassault Systèmes](https://www.3ds.com).

# Prerequisites
You need:
- `MD_UML_169_no_install.zip`
- `jdk-6u20-linux-x64.bin`
- `MagicDraw_16_9_Enterprise_Mobile_key.txt`

These files are no longer available online. We will assume these files
to be in the md/assets folder which is configured  in .gitignore.

## Testing Java GUI/X11 Setup

Before attempting to run MagicDraw in Docker, it's essential to verify that Java 6 Swing GUI applications can run properly in your Docker environment. This prerequisite test helps ensure:
- Java 6 is working correctly in the container
- X11 forwarding is properly configured
- Display settings are working on your host system

### Quick Java 6 Swing GUI Test

Clone this repository:
```bash
git clone https://github.com/WolfgangFahl/magicdraw-with-docker
cd magicdraw-with-docker
cd guitest
./build
./run
```

If successful, you'll see a simple window with a "Click me" button. If the button responds with a dialog "Thank you" - your setup should be ready for running MagicDraw 16.9 in a similar docker container.

#### Setup Notes
Linux Users: X11 forwarding should work out of the box
MacOS Users:

Install XQuartz and then socat (e.g. via MacPorts/Homebrew):
```bash
sudo port install socat
```
