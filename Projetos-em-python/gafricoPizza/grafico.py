import matplotlib.pyplot as plt
import numpy as np

#valores do grafico#

y = np.array([35, 25, 25, 15])

#intens do gafricO#

mylabels = ['Maçãs', 'Banana', 'Laranja', 'Melancia']

#espaços ente fatias#

myexplode = [0.2, 0, 0, 0]

plt.pie(y, labels=mylabels, explode=myexplode, shadow=True)
plt.show()


