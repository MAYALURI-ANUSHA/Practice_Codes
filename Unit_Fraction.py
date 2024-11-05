from fractions import Fraction

def egyptian_fraction(numerator, denominator):
    result = []
    
    while numerator != 0:
        # Find the ceiling of the division
        unit_fraction = -(-denominator // numerator)
        
        # Add the unit fraction to the result
        result.append(unit_fraction)
        
        # Update numerator and denominator for the next iteration
        numerator = numerator * unit_fraction - denominator
        denominator = denominator * unit_fraction
    
    return result
n=int(input())
d=int(input())
for i in egyptian_fraction(n,d):
    print(i)